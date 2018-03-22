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
        int sBricks = (legoDots % 4) % 2;
        return sBricks;
    }

    public int createMediumBrick(int legoDots) {
        int mBricks = 0;
        if (legoDots % 4 != 0) {
            mBricks = (legoDots % 4) / 2;
            return mBricks;
        }
        return mBricks;
    }

    public int createLargeBrick(int legoDots) {
        int lBricks = legoDots / 4;
        return lBricks;
    }

    
    public int createSecoundLayer (int legoDots) {
       int mBricks = 0;
        if (legoDots % 4 == 0 && legoDots > 8) {
            mBricks += 1;
            legoDots -= 2;
            createLargeBrick(legoDots);
            createMediumBrick(legoDots);
            createSmallBrick(legoDots);
        }
        
        else {
            createLargeBrick(legoDots);
            createMediumBrick(legoDots);
            createSmallBrick(legoDots);
        }
        return mBricks;
    }
//    public int createMediumBrickTwo(int legoDots) {
//        int mBricksTwo = 0;
//        if (legoDots % 4 == 0) {
//            return 
//        }
//
//        if () {
//
//        }
//    }
//
//    public int createLargeBrickTwo(int legoDots) {
//
//    }

}
