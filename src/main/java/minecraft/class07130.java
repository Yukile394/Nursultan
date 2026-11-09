package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class class07130 implements class07135 {
   private final class01996 N;
   private final CompletableFuture<class01929> i;

   public class07130(class01996 var1, CompletableFuture<class01929> var2) {
      super();
      this.N = var1;
      this.i = var2;
   }

   @Override
   public String method_10321() {
      return "Command Syntax";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      Path path = this.N.method_45972(class02024.field_39369).resolve("commands.json");
      return this.i.thenCompose(var2x -> {
         CommandDispatcher<class07701> commanddispatcher = new class07686(class07671.field_25419, class07686.N(var2x)).N();
         return class07135.N(var1, class01906.N(commanddispatcher, commanddispatcher.getRoot()), path);
      });
   }
}
