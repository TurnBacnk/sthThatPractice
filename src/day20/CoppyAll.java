package day20;

import java.io.*;

public class CoppyAll {
    public static void main(String[] args) {
        File srcFile = new File("/Applications/IDEA Project/src/day06");
        File destFile = new File("/Users/apple/Desktop/Copy");
        copyDir(srcFile,destFile);
    }

    /**
     * 拷贝目录
     * @param srcFile   拷贝源
     * @param destFile  拷贝目标
     */
    private static void copyDir(File srcFile, File destFile) {
        //获取源下面的子目录
        File[] files = srcFile.listFiles();
        if (srcFile.isFile()){
            FileInputStream in = null;
            FileOutputStream out = null;
            try{
                in = new FileInputStream(srcFile);
                File file;
                String path = destFile.getAbsolutePath().endsWith("/") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "/" +srcFile.getAbsolutePath().substring(0);
                out = new FileOutputStream(path);
                byte[] bytes =new byte[1024*1024];
                int readCount = 0;
                while((readCount = in.read(bytes)) != -1){
                    out.write(bytes,0,readCount);
                }
                out.flush();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null ){
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(in != null){
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        for(File file : files ){
            //递归调用
            //System.out.println(file.getAbsolutePath());
            if (file.isDirectory()){
                //新建对应目录
                String srcDir = file.getAbsolutePath();
                String destDir = destFile.getAbsolutePath().endsWith("/") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + '/' +srcDir.substring(0);
                File newFile = new File(destDir);
                if (newFile.exists()){
                    newFile.mkdirs();
                }
            }
            copyDir(file,destFile);
        }
    }
}
