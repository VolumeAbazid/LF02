import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.TextAlignment;

import java.io.IOException;

public class KaufvertragPDF {
    public static void main(String[] args) throws IOException {


        String datei = " H:/Lf02/Kaufvertrag.Pdf";


        PdfWriter writer = new PdfWriter(datei);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);


            //PDf Bearbeitung
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        document.setFont(font);
        document.setFontSize(14);
        //Überschrift
        Style fontueberschrift = new Style();
        fontueberschrift.setFont(PdfFontFactory.createFont(StandardFonts.HELVETICA));
        fontueberschrift.setFontSize(40);
        fontueberschrift.setBold();
        fontueberschrift.setUnderline();
        fontueberschrift.setTextAlignment(TextAlignment.CENTER);

        //Absatzüberschrift

        Style fontAbsatzUeberschrift = new Style();
        fontAbsatzUeberschrift.setFont(PdfFontFactory.createFont(StandardFonts.HELVETICA));
        fontAbsatzUeberschrift.setFontSize(15);
        fontAbsatzUeberschrift.setUnderline();
        fontAbsatzUeberschrift.setItalic();


        //Keafer Infos

        Vertragspartner kaeufer = new Vertragspartner("Christian", "Schneider");
        kaeufer.setAdresse(new Adresse("Kurva Str.", "12", "28257", "Bremen"));
        kaeufer.setAusweisNr("123456");


        //Verkeafer Infos

        Vertragspartner verkaeufer = new Vertragspartner("Aaron", "Johnson");
        verkaeufer.setAdresse(new Adresse("Timmer Straße", "91", "28277", "Bremen"));
        verkaeufer.setAusweisNr("654321");

        //Ware Infos

        Ware eier = new Ware("Frische", 10.50);
        eier.setBeschreibung("Die Beste eier aller zeiten !");
        eier.getBesonderheiten("Rundig, Geil").add("Traum jedes Mensch");
        eier.getMaengel("keine").add("Leider sind dieser eier nicht für jeder Mensch");





            Paragraph ueberschrift = new Paragraph("Kaufvertrag");
            ueberschrift.addStyle(fontueberschrift);
            ueberschrift.add("\n");



            //Warentabelle

        Table waretable = new Table(2);
            Cell header1 = new Cell();
            header1.add(new Paragraph("Text"));
            header1.setTextAlignment(TextAlignment.CENTER);
            waretable.addHeaderCell(header1);
            waretable.addCell("Bezeichnung");
            waretable.addCell("Hallo");

            Cell header2 = new Cell();
            header2.add(new Paragraph("Wert"));
            header2.setTextAlignment(TextAlignment.CENTER);
            waretable.addHeaderCell(header2);
            waretable.addCell("Hallo2");





            Paragraph ware = new Paragraph(new Text("Ware Information").addStyle(fontAbsatzUeberschrift));
            ware.add("\n");
            ware.add("" + eier);
            ware.add("\n");
            ware.add("\n");





            Paragraph pKaeufer = new Paragraph(new Text("Käufer Information").addStyle(fontAbsatzUeberschrift));
            pKaeufer.add("\n");
            pKaeufer.add("" + kaeufer);
            pKaeufer.add("\n");
            pKaeufer.add("\n");

            Paragraph pverkaeufer = new Paragraph(new Text("Verkäufer Information").addStyle(fontAbsatzUeberschrift));
            pverkaeufer.add("\n");
            pverkaeufer.add("" + verkaeufer);
            pverkaeufer.add("\n");
            pverkaeufer.add("\n");


            document.add(ueberschrift);
            document.add(waretable);
            document.add(pKaeufer);
            document.add(pverkaeufer);
            document.close();



        }




    }

