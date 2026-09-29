//Варіант 1
//− Продукт: House (має стіни, дах, вікна, двері).
//− Будівельник (Interface): IHouseBuilder (методи buildWalls(),
//buildRoof(), buildWindows(), getResult()).
//− Конкретний Будівельник: StoneHouseBuilder (будує кам'яний
//будинок).
//− Директор (Опціонально): Foreman (має метод
//constructStandardHouse()).
;

public class App {

        public static void main(String[] args){
             StoneHouseBuilder builder = new StoneHouseBuilder();
             builder.buildRoof();
             builder.buildWalls();
             builder.buildDoors();
             builder.buildWindows();
            builder.getResult();
        }

    }

