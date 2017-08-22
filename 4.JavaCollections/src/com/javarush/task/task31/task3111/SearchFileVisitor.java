package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;

    private boolean isSetPartOfName;
    private boolean isSetPartOfContent;
    private boolean isSetMinSize;
    private boolean isSetMaxSize;

    private List<Path> foundFiles = new ArrayList<Path>();

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    public String getPartOfName() {
        return partOfName;
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
        isSetPartOfName = true;
    }

    public String getPartOfContent() {
        return partOfContent;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
        isSetPartOfContent = true;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
        isSetMinSize = true;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
        isSetMaxSize = true;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        String content = new String(Files.readAllBytes(file));
        boolean isTrue = false;

        if ( isSetPartOfName && file.getFileName().toString().contains(partOfName)) {
            isTrue = true;
        }

        else if (isSetPartOfContent && content.contains(partOfContent)){
            isTrue = true;
        }

        else if (isSetMaxSize && maxSize > attrs.size()){
            isTrue = true;
        }

        else if (isSetMinSize && minSize < attrs.size()) {
            isTrue = true;
        }

        if (isTrue)
            foundFiles.add(file);

        return FileVisitResult.CONTINUE;
    }
}
