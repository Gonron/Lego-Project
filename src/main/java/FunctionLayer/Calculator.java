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
        int sBrickLenght = (legoDots % 4) % 2;
        return sBrickLenght;
    }

    public int createMediumBrick(int legoDots) {
        int mBrickLength = 0;
        if (legoDots % 4 == 0) {
            mBrickLength = (legoDots % 4) / 2;
            return mBrickLength;
        }
        return mBrickLength;
    }

    public int createLargeBrick(int legoDots) {
        int lBrickDots = legoDots / 4;
        return lBrickDots;
    }
    
    public int brickWork(int sBrickLength, int mBrickLength, int lBrickLengt) {
        return 00;
    }
}
