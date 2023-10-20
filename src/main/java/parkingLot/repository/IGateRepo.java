package parkingLot.repository;

import parkingLot.models.Gate;

public interface IGateRepo {

    Gate getGateById(Long id);
    Gate saveGate(Gate t);
}
