package minecraft;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class00190 extends class02980 {
   private static final class01612 i = new class01612(class00392.L("resourcePack.vanilla.description"), class07529.y().method_70592(class01603.field_14188).N());
   private static final class02955 R = class02955.N(class01612.N, i);
   public static final String N = "high_contrast";
   private static final Map<String, class00392> M = Map.of(
      "programmer_art", class00392.L("resourcePack.programmer_art.name"), "high_contrast", class00392.L("resourcePack.high_contrast.name")
   );
   private static final class02267 B = new class02267("vanilla", class00392.L("resourcePack.vanilla.name"), class01283.L, Optional.of(class02980.u));
   private static final class02268 Z = new class02268(true, class01090.field_14281, false);
   private static final class02268 z = new class02268(false, class01090.field_14280, false);
   private static final class01894 U = class01894.y("resourcepacks");
   @Nullable
   private final Path E;

   public class00190(Path var1, class04173 var2) {
      super(class01603.field_14188, y(var1), U, var2);
      this.E = this.N(var1);
   }

   private static class01611 y(Path var0) {
      return new class02997().N(R).N("minecraft", "realms").y().N().N(class01603.field_14188, var0).N(B);
   }

   @Nullable
   @Override
   protected class01055 N(String var1, class01061 var2, class00392 var3) {
      return class01055.N(N(var1, var3), var2, class01603.field_14188, z);
   }

   @Override
   protected void N(BiConsumer<String, Function<String, class01055>> var1) {
      super.N(var1);
      if (this.E != null) {
         this.N(this.E, var1);
      }
   }

   @Override
   protected class00392 N(String var1) {
      class00392 class00392 = M.get(var1);
      return (class00392)(class00392 != null ? class00392 : class00392.y(var1));
   }

   @Nullable
   @Override
   protected class01055 N(class01622 var1) {
      return class01055.N(B, y(var1), class01603.field_14188, Z);
   }

   private static class02267 N(String var0, class00392 var1) {
      return new class02267(var0, var1, class01283.L, Optional.of(class02298.N(var0)));
   }

   @Nullable
   private Path N(Path var1) {
      if (class07529.ND && var1.getFileSystem() == FileSystems.getDefault()) {
         Path path = var1.getParent().resolve("resourcepacks");
         if (Files.isDirectory(path)) {
            return path;
         }
      }

      return null;
   }
}
