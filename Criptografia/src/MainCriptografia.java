import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.*;
import java.util.Scanner;

public class MainCriptografia {

	public static void main(String[] args) {
		
		while (true) {
		
			System.out.print("\n[run/quit]: ");
			Scanner Leitor = new Scanner(System.in);
			String Texto = Leitor.nextLine();
			
			if (Texto != null && !Texto.isEmpty()) {
				if ("run".equals(Texto)){
					System.out.println("\nDigite uma informação para ser CRIPTOGRAFADA: ");
					Texto = Leitor.nextLine();
					Texto = Criptografar(Texto);
					System.out.println("\nInformação CRIPTOGRAFADA: " + Texto + "\n");
				}
				
				else if ("quit".equals(Texto))
					break;				
			
			} else {
				System.out.println("Necessário inserir uma informação para ser CRIPTOGRAFADA.");
			}
		
		}
	}
	
	
	public static String Criptografar(String texto) {
		
		try {
			MessageDigest md5Hash = MessageDigest.getInstance("MD5");
			
			md5Hash.update(texto.getBytes());
			BigInteger hash = new BigInteger(1, md5Hash.digest());
			return hash.toString(16);
			
		} catch (NoSuchAlgorithmException e) {
			return null;
		
		}
		
		
	}
	
}


/*public static string Criptografar(string texto)
        {
            var md5hash = MD5.Create();
            var gerarString = new StringBuilder();
            var vetor = Encoding.Default.GetBytes(texto);
            vetor = md5hash.ComputeHash(vetor);

            foreach(var item in vetor)
            {
                gerarString.Append(item.ToString("x2"));
            }

            return gerarString.ToString();
        }
        }*/