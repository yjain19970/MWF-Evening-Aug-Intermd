package parkingLot.repository;

import parkingLot.models.Gate;

import java.util.Optional;

public class MySqlGateRepo implements IGateRepo{
    @Override
    public Optional<Gate> getGateById(Long id) {
        return null;
    }

    @Override
    public Gate saveGate(Gate t) {
        return null;
    }
}
