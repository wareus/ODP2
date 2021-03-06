package rocket.construct;

import rocket.RocketComponent;
import rocket.components.Engine;
import rocket.components.FuelTank;
import rocket.components.Hull;
import rocket.components.Wings;
import rocket.construct.RocketBuilderVisitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Wareus on 2016-02-27.
 */
public class RocketBlueprint
{
    private List<RocketComponent> components = new LinkedList<>();

    public RocketBlueprint(Hull hull, Wings wings, Engine engine, FuelTank fuelTank)
    {
        components.add(hull);
        components.add(wings);
        components.add(engine);
        components.add(fuelTank);

    }

    public List<RocketComponent> getComponents()
    {
        return components;
    }
}
