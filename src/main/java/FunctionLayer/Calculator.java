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

    public int createMediumBrickTwo(int legoDots) {
        int mBricksTwo = 0;
        if (legoDots % 4 == 0 && legoDots > 8) {
            mBricksTwo = mBricksTwo + 2;
        }
        if (legoDots % 4 != 0) {
            mBricksTwo = (legoDots % 4) / 2;
        }
        return mBricksTwo;
    }

    public int createLargeBrickTwo(int legoDots) {
        int lBricksTwo = legoDots / 4;
        if (legoDots % 4 == 0 && legoDots > 8) {
            lBricksTwo = lBricksTwo - 1;
        }
        return lBricksTwo;
    }

    public int totalSmallBricks(int sBrickLength, int sBrickWidth, int height) {
        int unequalLayer = (sBrickLength + sBrickWidth) * (height / 2);
        int equalLayer = (sBrickLength + sBrickWidth) * (height / 2 - height) ;
        return (unequalLayer + equalLayer) * 2;
    }

    public int totalMediumBricks(int mBrickLength, int mBrickLengthTwo, int mBrickWidth, int mBrickWidthTwo, int height) {
        int unequalLayer = (mBrickLength + mBrickWidth + mBrickLengthTwo + mBrickWidthTwo) * (height / 2);
        int equalLayer = (mBrickLength + mBrickWidth + mBrickLengthTwo + mBrickWidthTwo) * (height / 2 - height) ;
        return (unequalLayer + equalLayer) * 2;
    }

    public int totalLargeBricks(int lBrickLength, int mBrickLengthTwo, int lBrickWidth, int lBrickWidthTwo, int height) {
        int unequalLayer = (lBrickLength + lBrickWidth + mBrickLengthTwo + lBrickWidthTwo) * (height / 2);
        int equalLayer = (lBrickLength + lBrickWidth + mBrickLengthTwo + lBrickWidthTwo) * (height / 2 - height) ;
        return (unequalLayer + equalLayer) * 2;
    }
}
