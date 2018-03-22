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
public class Calculator {
    
    public int createSmallBrick(int legoDots) {
        int sBrickDots = (legoDots % 4) % 2;
        return sBrickDots;
    }

    public int createMediumBrick(int legoDots) {
        int mBrickDots = 0;
        if (legoDots % 4 == 0) {
            mBrickDots = (legoDots % 4) / 2;
            return mBrickDots;
        }
        return mBrickDots;
    }

    public int createLargeBrick(int legoDots) {
        int lBrickDots = legoDots / 4;
        return lBrickDots;
    }
    
    public int smallBrickWork(int sBrickLength, int sBrickWidth) {
        return 00;
    }
    
    public int mediumlBrickWork(int mBrickLength, int mBrickWidth) {
        return 00;
    }
    
    public int largeBrickWork(int lBrickLength, int lBrickWidth) {
        return 00;
    }
    
    
}
