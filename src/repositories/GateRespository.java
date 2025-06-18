package repositories;

import models.Gate;
import models.GateStatus;
import models.GateType;
import models.Operator;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRespository
{
    Map<Integer, Gate> gates;
    public GateRespository()
    {
        gates = new TreeMap<>();
        Gate gate = new Gate(1, "1", GateType.ENTRY, GateStatus.OPERATIONAL, new Operator("ABC"));
    }

    public Optional<Gate> findById(int gate_id)
    {
        return Optional.ofNullable(gates.get(gate_id));
    }
}
