package parkingLot.repository;

import parkingLot.models.Gate;

import java.util.Map;
import java.util.Optional;

public class GateRepository implements IGateRepo {
    private Map<Long, Gate> gateDB;
    private long lastSavedId=0L;

    public GateRepository(Map<Long, Gate> gateDB) {
        this.gateDB = gateDB;
    }


    public Optional<Gate> getGateById(Long id){
        return Optional.ofNullable(gateDB.get(id));
    }

    public Gate saveGate(Gate t){
        lastSavedId++;
        t.setId(lastSavedId);
        gateDB.put(lastSavedId,t);
        return gateDB.get(lastSavedId);
    }


}
