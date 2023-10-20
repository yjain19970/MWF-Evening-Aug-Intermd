package parkingLot.repository;

import parkingLot.models.Gate;

import java.util.Optional;

public interface IGateRepo {

    Optional<Gate> getGateById(Long id);
    Gate saveGate(Gate t);
}
