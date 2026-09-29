public class StoneHouseBuilder implements IHouseBuilder{
    private House house;

    private IElement roof;
    private IElement walls;
    private  IElement windows;
    private IElement doors;

    @Override
    public void buildWalls() {
         walls = new Wall();
        walls.create();
    }
    @Override
    public void buildRoof(){
         roof = new Roof();
        roof.create();
    }

    @Override
    public void buildWindows(){
         windows = new Window();
        windows.create();
    }
    @Override
    public void buildDoors(){
         doors = new Door();
        doors.create();
    }

    @Override
    public House getResult(){
        System.out.println("///Returning concrete house///");
        House house = new House();
        house.walls = 4;
        house.roofType = "Classic Metal";
        house.doors = 1;
        house.windows = 2;
        house.showHouse();
        return house;
    }
}
//        %%
//      %%%%%%
//    %%%%%%%%%%
//    ##########
//    #		 #
//    #		 #
//    #		 #
//    #		 #
//    ##########
//  ####      ####
//#      #  #     #
//#       # #      #
//  #   #     #   #
//    ##        ##