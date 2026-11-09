package minecraft;

import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.apache.commons.io.FileUtils;

public class class02877 extends class06172 {
   private final class05918 N;
   private final Path y;

   public class02877(class02277 var1, Path var2, class02277 var3, Path var4, DataFixer var5, boolean var6, class05715 var7, Supplier<class06820> var8) {
      super(var1, var2, var5, var6, var7, var8);
      this.y = var4;
      this.N = new class05918(var3, var4, var6);
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.N.close();
      if (this.y.toFile().exists()) {
         FileUtils.deleteDirectory(this.y.toFile());
      }
   }

   @Override
   public CompletableFuture<Void> N(class07321 var1, Supplier<class07001> var2) {
      this.i(var1);
      return this.N.N(var1, var2);
   }
}
