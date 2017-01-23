package entities;


import java.util.Date;

/**
 * Created by g.zubenko on 23.01.2017.
 */
public class Order extends BaseEntity{
    public enum Fields {ID, USER_ID, ROOM_ID, START_DATE, END_DATE}
    private long userId;
    private long roomId;
    private Date startReservationDate;
    private Date endReservationDate;

    public Order(long id, long userId, long roomId, Date startReservationDate, Date endReservationDate) {
        super(id);
        this.userId = userId;
        this.roomId = roomId;
        this.startReservationDate = startReservationDate;
        this.endReservationDate = endReservationDate;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public Date getStartReservationDate() {
        return startReservationDate;
    }

    public void setStartReservationDate(Date startReservationDate) {
        this.startReservationDate = startReservationDate;
    }

    public Date getEndReservationDate() {
        return endReservationDate;
    }

    public void setEndReservationDate(Date endReservationDate) {
        this.endReservationDate = endReservationDate;
    }
}
