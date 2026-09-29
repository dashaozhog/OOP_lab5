public class Roof implements IElement{
    @Override
    public void create(){
        String roofLine = """
                  %
                 %%%
                %%%%%
                Roof Builded""";
        System.out.println(roofLine);
    }
}
