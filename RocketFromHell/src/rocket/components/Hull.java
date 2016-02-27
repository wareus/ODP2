package rocket.components;

import gui.Assets;
import javafx.scene.image.Image;
import rocket.RocketComponent;

/**
 * Created by Wareus on 2016-02-27.
 */
public class Hull extends RocketComponent
{
    @Override
    public Image getSprite()
    {
        return Assets.hull;
    }

    @Override
    public float getForce()
    {
        return 0;
    }

    @Override
    public float getMass()
    {
        return 200;
    }

    @Override
    public float getHandle()
    {
        return 0;
    }

    @Override
    public int getArmor()
    {
        return 0;
    }

    @Override
    public int getHull()
    {
        return 100;
    }
}