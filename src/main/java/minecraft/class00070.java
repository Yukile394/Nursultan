package minecraft;

import com.google.gson.annotations.SerializedName;
import org.jspecify.annotations.Nullable;

public record class00070(
   int slotId,
   int spawnProtection,
   boolean forceGameMode,
   int difficulty,
   int gameMode,
   String slotName,
   String version,
   class04949 compatibility,
   long templateId,
   String templateImage,
   boolean hardcore
) implements class04942 {
   @SerializedName("forceGameMode")
   public boolean L() {
      return this.forceGameMode;
   }

   @SerializedName("version")
   public String M() {
      return this.version;
   }

   public class00070(int var1, class04980 var2, boolean var3) {
      this(var1, var2.N, var2.y, var2.L, var2.u, var2.N(var1), var2.i, var2.R, var2.M, var2.B, var3);
   }

   public class00070(
      int slotId,
      int spawnProtection,
      boolean forceGameMode,
      int difficulty,
      int gameMode,
      String slotName,
      String version,
      class04949 compatibility,
      long templateId,
      @Nullable String templateImage,
      boolean hardcore
   ) {
      super();
      this.slotId = slotId;
      this.spawnProtection = spawnProtection;
      this.forceGameMode = forceGameMode;
      this.difficulty = difficulty;
      this.gameMode = gameMode;
      this.slotName = slotName;
      this.version = version;
      this.compatibility = compatibility;
      this.templateId = templateId;
      this.templateImage = templateImage;
      this.hardcore = hardcore;
   }

   @SerializedName("compatibility")
   public class04949 B() {
      return this.compatibility;
   }

   @SerializedName("worldTemplateId")
   public long Z() {
      return this.templateId;
   }

   @SerializedName("gameMode")
   public int i() {
      return this.gameMode;
   }

   @SerializedName("hardcore")
   public boolean U() {
      return this.hardcore;
   }

   @SerializedName("worldTemplateImage")
   @Nullable
   public String z() {
      return this.templateImage;
   }

   @SerializedName("difficulty")
   public int u() {
      return this.difficulty;
   }

   @SerializedName("spawnProtection")
   public int y() {
      return this.spawnProtection;
   }

   @SerializedName("slotId")
   public int N() {
      return this.slotId;
   }

   @SerializedName("slotName")
   public String R() {
      return this.slotName;
   }
}
