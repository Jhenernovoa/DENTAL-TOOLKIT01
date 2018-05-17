package scanner;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import dentaltoolkit.Frame.Camara;
import javax.swing.JPanel;

public class WebcamQRCodeExample extends JFrame{

	private static final long serialVersionUID = 6441489157408381878L;

        public String QR="";
	private Webcam webcam = null;
	private WebcamPanel panel = null;
        
        

	public WebcamQRCodeExample() {
		super();

		setLayout(new FlowLayout());
		setTitle("Lector de QR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLocationRelativeTo(null);

		Dimension size = WebcamResolution.QVGA.getSize();

		webcam = Webcam.getWebcams().get(0);
		webcam.setViewSize(size);

		panel = new WebcamPanel(webcam);
		panel.setPreferredSize(size);
                JPanel C= new JPanel();
                C.add(new Camara());
		add(C);
		pack();
		setVisible(true);
                
	}

	public String run() {
               int a = 0;
		do {
			Result result = null;
			BufferedImage image = null;

			if (webcam.isOpen()) {

				image=webcam.getImage();
                                
				LuminanceSource source = new BufferedImageLuminanceSource(image);
				BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

				try {
					result = new MultiFormatReader().decode(bitmap);
				} catch (NotFoundException e) {
					// fall thru, it means there is no QR code in image
				}
			}

			if (result != null) {
                            a=1;
                            QR=result.getText();
                            dispose();
                            return QR;
			}

		} while (a==0);
                 return QR;
	}

}