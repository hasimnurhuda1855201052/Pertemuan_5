/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author HASIM
 */
public class writedoc {

    public static void main(String[] args) throws FileNotFoundException, IOException {

     
        String teks = "Write adalah kebalikan dari read."
                + "Write secara bahasa berarti menulis'"
                + "Artinya menuliskan suatu teks."
                + "Untuk dibuat file berexstensi khusus."
                + "Dalam hal ini write di khususkan untuk"
                + "Membuat doc file.Unduh library Khusus"
                + "write doc di libDocWrite.tiru sebagaimana"
                + "Langkah-langkah pada proses read doc hingga"
                + "sesuai dengan gambar 4.1 /t ";
        String outDocEn = "D://HAIM.doc";
        XWPFDocument document = new XWPFDocument();
        FileOutputStream out = new FileOutputStream(new File(outDocEn));
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(teks);
        document.write(out);
        out.close();
        System.out.println("Berhasil Menyimpan");
    }
}
