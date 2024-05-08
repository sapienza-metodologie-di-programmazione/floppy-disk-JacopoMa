package metodologie;

import java.util.List;

class UndefinedMemory extends Exception {
}

class OutOfMemory extends Exception {
}

class WriteBlockActive extends Exception {
}

public interface Floppy {
    void placeHead(int position) throws OutOfMemory;

    List<Byte> read(int size) throws OutOfMemory, UndefinedMemory;

    void write(List<Byte> bytes) throws OutOfMemory, WriteBlockActive;

    void format() throws WriteBlockActive;

    void activateWriteBlock();

    void deactivateWriteBlock();
}