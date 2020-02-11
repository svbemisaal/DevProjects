import org.w3c.dom.Node;

public class PopulateObjects
{
    public  CarIdentities func(CarIdentities carIdentities, Node attr)
    {
        carIdentities.setVarId(attr.getAttributes().getNamedItem("VarID").getNodeValue());
        carIdentities.setOsmId(attr.getAttributes().getNamedItem("Title").getNodeValue().toLowerCase());
        carIdentities.setOffset(attr.getAttributes().getNamedItem("FW_Offset").getNodeValue());
        carIdentities.setDivider(attr.getAttributes().getNamedItem("FW_Divider").getNodeValue());
        carIdentities.setMultiplier(attr.getAttributes().getNamedItem("FW_Multiplier").getNodeValue());
        carIdentities.setTitle(attr.getAttributes().getNamedItem("Title").getNodeValue());

        return carIdentities;
    }
}
