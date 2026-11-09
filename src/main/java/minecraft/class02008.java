package minecraft;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;
import net.fabricmc.fabric.api.renderer.v1.sprite.FabricStitchResult;
import net.fabricmc.fabric.impl.renderer.SpriteFinderImpl;
import net.fabricmc.fabric.impl.renderer.StitchResultExtension;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public final class class02008 implements FabricStitchResult, StitchResultExtension {
   private int width;
   private int height;
   private int mipLevel;
   private class08388 missing;
   private Map<class01894, class08388> regions;
   private CompletableFuture<Void> readyForUpload;
   @Nullable
   private volatile SpriteFinder M;

   public int L() {
      return this.mipLevel;
   }

   public class02008(int var1, int var2, int var3, class08388 var4, Map<class01894, class08388> var5, CompletableFuture<Void> var6) {
      super();
      this.width = var1;
      this.height = var2;
      this.mipLevel = var3;
      this.missing = var4;
      this.regions = var5;
      this.readyForUpload = var6;
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class02008
            && this.width == ((class02008)var1).width
            && this.height == ((class02008)var1).height
            && this.mipLevel == ((class02008)var1).mipLevel
            && Objects.equals(this.missing, ((class02008)var1).missing)
            && Objects.equals(this.regions, ((class02008)var1).regions)
            && Objects.equals(this.readyForUpload, ((class02008)var1).readyForUpload);
   }

   @Override
   public final String toString() {
      return "class02008[width="
         + Integer.toString(this.width)
         + ", height="
         + Integer.toString(this.height)
         + ", mipLevel="
         + Integer.toString(this.mipLevel)
         + ", missing="
         + Objects.toString(this.missing)
         + ", regions="
         + Objects.toString(this.regions)
         + ", readyForUpload="
         + Objects.toString(this.readyForUpload)
         + "]";
   }

   @Override
   public final int hashCode() {
      return (
               (
                        (((0 * 31 + Integer.hashCode(this.width)) * 31 + Integer.hashCode(this.height)) * 31 + Integer.hashCode(this.mipLevel)) * 31
                           + Objects.hashCode(this.missing)
                     )
                     * 31
                  + Objects.hashCode(this.regions)
            )
            * 31
         + Objects.hashCode(this.readyForUpload);
   }

   public Map<class01894, class08388> i() {
      return this.regions;
   }

   public class08388 u() {
      return this.missing;
   }

   public int y() {
      return this.height;
   }

   @Nullable
   public class08388 N(class01894 var1) {
      return this.regions.get(var1);
   }

   public int N() {
      return this.width;
   }

   public SpriteFinder spriteFinder() {
      Object object = this.M;
      if (object == null) {
         synchronized (this) {
            object = this.M;
            if (object == null) {
               this.M = (SpriteFinder)(object = new SpriteFinderImpl(this.regions, this.missing));
            }
         }
      }

      return (SpriteFinder)object;
   }

   public CompletableFuture<Void> R() {
      return this.readyForUpload;
   }

   @Nullable
   public SpriteFinder fabric_spriteFinderNullable() {
      return this.M;
   }
}
