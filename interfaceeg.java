interface animal{ 
    void walk();
}

class horse implements animal{ 
    @Override
    public void walk(){ 
        System.out.println("Horse walk");
    }
}

public class interfaceeg  {
    public static void main(String[] args) {
        horse a = new horse(); 
        a.walk();
    }
}




