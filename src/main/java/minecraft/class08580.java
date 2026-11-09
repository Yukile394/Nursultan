package minecraft;

import com.google.common.hash.Hashing;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

class class08580 {
   private final Path y;
   private final Type L;
   private final Map<String, CompletableFuture<class06955>> u;

   class08580(class08555 var1, Path var2, Type var3) {
      super();
      this.N = var1;
      this.u = new Object2ObjectOpenHashMap();
      this.y = var2;
      this.L = var3;
   }

   private CompletableFuture<class06955> y(MinecraftProfileTexture var1) {
      String s = Hashing.sha1().hashUnencodedChars(var1.getHash()).toString();
      class01894 class01894 = this.N(s);
      Path path = this.y.resolve(s.length() > 2 ? s.substring(0, 2) : "xx").resolve(s);
      return this.N.y.N(class01894, path, var1.getUrl(), this.L == Type.SKIN);
   }

   public CompletableFuture<class06955> N(MinecraftProfileTexture var1) {
      String s = var1.getHash();
      CompletableFuture<class06955> completablefuture = this.u.get(s);
      if (completablefuture == null) {
         completablefuture = this.y(var1);
         this.u.put(s, completablefuture);
      }

      return completablefuture;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private class01894 N(String var1) {
      return class01894.y(switch (this.L) {
         case SKIN -> "skins";
         case CAPE -> "capes";
         case ELYTRA -> "elytra";
         default -> throw new MatchException(null, null);
      } + "/" + var1);
   }
}
