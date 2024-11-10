// Componente base
interface Assento {
    double getCusto();
    String getDescricao();
}

// =============================== cadeiras ===================================

// Implementação concreta do componente para Cadeira
class CadeiraMadeira implements Assento {
    @Override
    public double getCusto() {
        return 50.0;
    }

    @Override
    public String getDescricao() {
        return "Cadeira de madeira";
    }
}

class CadeiraAluminio implements Assento {
    @Override
    public double getCusto() {
        return 45.0;
    }

    @Override
    public String getDescricao() {
        return "Cadeira de alumínio";
    }
}

class CadeiraPlastico implements Assento {
    @Override
    public double getCusto() {
        return 30.0;
    }

    @Override
    public String getDescricao() {
        return "Cadeira de plástico";
    }
}



// =============================== puff ===================================


// Implementação concreta do componente para Puff
class PuffBasico implements Assento {
    @Override
    public double getCusto() {
        return 25.0;
    }

    @Override
    public String getDescricao() {
        return "Puff básico";
    }
}

class PuffBob implements Assento {
    @Override
    public double getCusto() {
        return 45.0;
    }

    @Override
    public String getDescricao() {
        return "Puff Bob Esponja";
    }
}

class PuffPatrick implements Assento {
    @Override
    public double getCusto() {
        return 45.0;
    }

    @Override
    public String getDescricao() {
        return "Puff Patrick";
    }
}

class PuffGary implements Assento {
    @Override
    public double getCusto() {
        return 40.0;
    }

    @Override
    public String getDescricao() {
        return "Puff Gary";
    }
}


// =============================== sofa ===================================



class SofaSimples implements Assento {
    @Override
    public double getCusto() {
        return 200.0;
    }

    @Override
    public String getDescricao() {
        return "Sofá simples";
    }
}

class Poltrona implements Assento {
    @Override
    public double getCusto() {
        return 150.0;
    }

    @Override
    public String getDescricao() {
        return "Poltrona";
    }
}

class SofaTresLugares implements Assento {
    @Override
    public double getCusto() {
        return 300.0;
    }

    @Override
    public String getDescricao() {
        return "Sofá de 3 lugares";
    }
}


class SofaCama implements Assento {
    @Override
    public double getCusto() {
        return 400.0;
    }

    @Override
    public String getDescricao() {
        return "Sofá cama";
    }
}

// =============================== tipos estofados  ===================================


class AlmofadaBasica implements Assento {
    private Assento assento;

    AlmofadaBasica(Assento assento) {
        this.assento = assento;
    }

    @Override
    public double getCusto() {
        return assento.getCusto() + 30.0;
    }

    @Override
    public String getDescricao() {
        return assento.getDescricao() + ", com almofada básica";
    }
}


class AlmofadaConffort implements Assento {
    private Assento assento;

    AlmofadaConfortavel(Assento assento) {
        this.assento = assento;
    }

    @Override
    public double getCusto() {
        return assento.getCusto() + 50.0;
    }

    @Override
    public String getDescricao() {
        return assento.getDescricao() + ", com almofada conffort";
    }
}

class AlmofadaPremium implements Assento {
    private Assento assento;

    AlmofadaPremium(Assento assento) {
        this.assento = assento;
    }

    @Override
    public double getCusto() {
        return assento.getCusto() + 80.0;
    }

    @Override
    public String getDescricao() {
        return assento.getDescricao() + ", com almofada premium";
    }
}