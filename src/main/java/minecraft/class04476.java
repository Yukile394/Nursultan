package minecraft;

import com.google.common.hash.HashCode;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public interface class04476 {
   class04476 N = (var0, var1, var2) -> {
      class06290.L(var0.getParent());
      Files.write(var0, var1);
   };

   void method_43346(Path var1, byte[] var2, HashCode var3) throws IOException;
}
