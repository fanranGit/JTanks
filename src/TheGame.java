/**
 * Created with IntelliJ IDEA.
 * User: panda
 * Date: 25.02.13
 * Time: 17:41
 * To change this template use File | Settings | File Templates.
 */

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;

class TheGame
{
    public static void main (String args[]) {
        try {
            Display.setTitle("JTanks");
            Display.setDisplayMode(new DisplayMode(800, 600));
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }

        while (!Display.isCloseRequested()) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}