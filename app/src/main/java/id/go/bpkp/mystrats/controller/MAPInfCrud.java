package id.go.bpkp.mystrats.controller;

import id.go.bpkp.mystrats.model.MAPDiklat;

public interface MAPInfCrud {

    public boolean create();

    public MAPDiklat find(String id);

    public MAPDiklat edit(String id);

    public boolean delete(String id);
}
