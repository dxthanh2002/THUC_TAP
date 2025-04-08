package Q30Q31_BuiltARoBushTheater;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Theater {

    class Seat implements Comparable<Seat> {

        private String seatNum;
        private boolean reserved;

        public Seat(char rowChar, int seatNo) {
            this.seatNum = "%c%03d".formatted(rowChar, seatNo).toUpperCase();
        }

        @Override
        public String toString() {
            return seatNum;
        }

        @Override
        public int compareTo(Seat o) {
            return seatNum.compareTo(o.seatNum);
        }
    }

    private String theateName;
    private int seatPerRow;
    private NavigableSet<Seat> seats;

    public Theater(String theateName, int rows, int totalSeats) {
        this.theateName = theateName;
        this.seatPerRow = totalSeats/rows;

        seats = new TreeSet<>();
        for (int i = 0; i < totalSeats; i++) {
            char rowChar = (char) (i / seatPerRow + (int) 'A');
            int seatInRow = i % seatPerRow + 1;
            seats.add(new Seat(rowChar, seatInRow));
        }
    }

    public void printSeats() {

        String separatorLine = "-".repeat(90);
        System.out.printf("%1$s%n%2$s Seat Map%n%1$s%n", separatorLine,
                theateName);

        int index = 0;
        for (Seat s : seats) {
            System.out.printf("%-8s%s",
                    s.seatNum +((s.reserved) ? "(\u25CF)" : ""),
                    ((index++ + 1) % seatPerRow == 0) ?  "\n" : "");
        }
        System.out.println(separatorLine);
    }

    /**
     * B1: lấy ghế ngời dùng chọn
     * B2:  lấy 1 ghế lớn hơn ghé ở B1
     * B3: nếu ko có ghế trả ra ko có ghế
     * nếu có ghế chưa dc đăt
     * @param row
     * @param seat
     * @return
     */
    public String reserveSeat(char row, int seat) {

        Seat requestedSeat = new Seat(row, seat);
        Seat requested = seats.ceiling(requestedSeat);

        if (requested == null || !requested.seatNum.equals(requestedSeat.seatNum)) {
            System.out.print("--> No such seat: " + requestedSeat);
            System.out.printf(": Seat must be between %s and %s%n",
                    seats.first().seatNum, seats.last().seatNum);
        } else {
            if (!requested.reserved) {
                requested.reserved = true;
                return requested.seatNum;
            } else {
                System.out.println("Seat's already reserved.");
            }
        }
        return null;
    }

    /**
     *
     * @param count : seat yêu cầu
     * @param first :
     * @param last :
     * @param min :
     * @param max :ý nghĩa
     * @return : trả về một tập hợp ghế hoặc null nếu không dc
     *
     */
    private boolean validate(int count, char first, char last, int min, int max) {

        boolean result = (min > 0 || seatPerRow >= count || (max - min + 1) >= count);
        result = result && seats.contains(new Seat(first, min));
        if (!result) {
            System.out.printf("Invalid! %1$d seats between " +
                            "%2$c[%3$d-%4$d]-%5$c[%3$d-%4$d] Try again",
                    count, first, min, max, last);
            System.out.printf(": Seat must be between %s and %s%n",
                    seats.first().seatNum, seats.last().seatNum);
        }

        return result;
    }

    /**
     *
     * @param count : seat yêu cầu
     * @param minRow : hàng tối thiểu
     * @param maxRow : hàng tối đa
     * @param minSeat : seat tối thiểu
     * @param maxSeat : Seat tối đa
     * @return
     */
    public Set<Seat> reserveSeats(int count, char minRow, char maxRow,
                                  int minSeat, int maxSeat) {

        char lastValid = seats.last().seatNum.charAt(0);
        maxRow = (maxRow < lastValid) ? maxRow : lastValid;// giới hạn lại max row

        if (!validate(count, minRow, maxRow, minSeat, maxSeat)) {
            return null;
        } //

        NavigableSet<Seat> selected = null;

        for (char A = minRow; A <= maxRow; A++) {
            // lấy ghế từ khoảng 
            NavigableSet<Seat> contiguous = seats.subSet(
                    new Seat(A, minSeat), true,
                    new Seat(A, maxSeat), true);

            int index = 0;
            Seat first = null;
            for (Seat current : contiguous) {
                if (current.reserved) {
                    index = 0;
                    continue;
                }
                first = (index == 0) ? current : first;
                if (++index == count) {
                    selected = contiguous.subSet(first, true,
                            current, true);
                    break;
                }
            }
            if (selected != null) {
                break;
            }
        }

        Set<Seat> reservedSeats = null;
        if (selected != null) {
            selected.forEach(s -> s.reserved = true);
            reservedSeats = new TreeSet<>(selected);
        }
        return reservedSeats;
    }
}
