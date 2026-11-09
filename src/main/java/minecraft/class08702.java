package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CompletionException;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08702 {
   private static final Logger N = LogUtils.getLogger();

   public class08702() {
      super();
   }

   public static void N(class06202 var0, class05096 var1, class05096 var2, int var3, class04981 var4, @Nullable class04734 var5) {
      class05213.N(var0, () -> var0.N(var1), (var6, var7, var8, var9) -> {
         Path path;
         try {
            path = N(var7, var8, var9);
         } catch (IOException ioexception) {
            N.warn("Failed to create temporary world folder.");
            var0.N(new class04702(class00392.L("mco.create.world.failed"), var2));
            return true;
         }

         class04980 class04980 = class04980.N(var8.q(), class07529.y().comp_4025());
         class00072 class00072 = new class00072(var3, class04980, List.of(class00064.N(var8.q().L())));
         class00246 class00246 = new class00246(path, class00072, var0.Ny(), var4.y, class00276.L());
         var0.y(new class01304(class00246::y, class00392.L("mco.create.world.reset.title"), class00392.i(), class05220.i, false));
         if (var5 != null) {
            var5.run();
         }

         class00246.N().handleAsync((var5xx, var6x) -> {
            if (var6x != null) {
               if (var6x instanceof CompletionException completionexception) {
                  var6x = completionexception.getCause();
               }

               if (var6x instanceof class08730) {
                  var0.y(var2);
               } else {
                  if (var6x instanceof class08715 class08715) {
                     N.warn("Failed to create realms world {}", class08715.N());
                  } else {
                     N.warn("Failed to create realms world {}", var6x.getMessage());
                  }

                  var0.y(new class04702(class00392.L("mco.create.world.failed"), var2));
               }
            } else {
               if (var1 instanceof class05092 class05092) {
                  class05092.N(var4.y);
               }

               if (var5 != null) {
                  class05685.N(var4, var1, true);
               } else {
                  var0.y(var1);
               }

               class05685.u();
            }

            return null;
         }, var0);
         return true;
      });
   }

   private static Path N(class02003<class02969> var0, class06207 var1, @Nullable Path var2) throws IOException {
      Path path = Files.createTempDirectory("minecraft_realms_world_upload");
      if (var2 != null) {
         Files.move(var2, path.resolve("datapacks"));
      }

      class07001 class07001x = var1.N(var0.N(), null);
      class07001 class07001x = new class07001();
      class07001x.N("Data", class07001x);
      Path path1 = Files.createFile(path.resolve("level.dat"));
      class07742.N(class07001x, path1);
      return path;
   }
}
