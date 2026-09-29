public class Wall implements IElement{
    @Override
    public void create(){
        String wallsLine = """
                #####
                #####
                #####
                #####
                Walls builded""";
        System.out.println(wallsLine);
    }
}
