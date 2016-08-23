import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


 class DataSaver {

    private FileWriter writer;

    DataSaver(File file, int collectionSize, int amountOfTimes){

        try{
            writer = new FileWriter(file, true);
            String sizeOfCollection = String.format("Collection size: %d, amount of times: %d%n", collectionSize, amountOfTimes);
            String header =String.format("%-13s%-6s%-11s%-9s%-11s%-11s%-14s%-6s%n",
                    "Name","Add","Contains", "Remove", "Populate", "Iter.add",
                    "Iter.remove","Get");
            String line =String.format("%s%n","----------------------------------------------------------------------------------");
            writer.write(sizeOfCollection);
            writer.write(header);
            writer.write(line);
            writer.flush();

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    void saveData(Data data){
        String toWrite = "File not found";
        if (data instanceof SetData) {
            SetData setData = (SetData) data;
            toWrite = String.format("%-12s%-8.3f%-11.3f%-10.3f%-10.3f%n",
                    setData.name, setData.addAvgValue, setData.containsAvgValue,
                    setData.removeAvgValue, setData.populateAvgValue);
        } if (data instanceof ListData){
            ListData listData = (ListData) data;
            toWrite = String.format("%-12s%-8.3f%-11.3f%-10.3f%-11.3f%-11.3f%-11.3f%-11.3f%n",
                    listData.name, listData.addAvgValue, listData.containsAvgValue,
                    listData.removeAvgValue, listData.populateAvgValue,
                    listData.listIteratorAddAvgValue,
                    listData.listIteratorRemoveAvgValue, listData.getAvgValue);
        }

            try {
                writer.write(toWrite);
                writer.flush();
            } catch (IOException ex) {
                ex.printStackTrace();
            }



    }
}
