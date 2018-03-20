/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author User
 */
public class Order {
    
    private int id;
    private int SmallBrick;
    private int MediumBrick;
    private int LargeBrick;
    private boolean orderStatus;

    public Order(int id, int SmallBrick, int MediumBrick, int LargeBrick, boolean orderStatus) {
        this.id = id;
        this.SmallBrick = SmallBrick;
        this.MediumBrick = MediumBrick;
        this.LargeBrick = LargeBrick;
        this.orderStatus = orderStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSmallBrick() {
        return SmallBrick;
    }

    public void setSmallBrick(int SmallBrick) {
        this.SmallBrick = SmallBrick;
    }

    public int getMediumBrick() {
        return MediumBrick;
    }

    public void setMediumBrick(int MediumBrick) {
        this.MediumBrick = MediumBrick;
    }

    public int getLargeBrick() {
        return LargeBrick;
    }

    public void setLargeBrick(int LargeBrick) {
        this.LargeBrick = LargeBrick;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", SmallBrick=" + SmallBrick + ", MediumBrick=" + MediumBrick + ", LargeBrick=" + LargeBrick + ", orderStatus=" + orderStatus + '}';
    }


    
    
}
