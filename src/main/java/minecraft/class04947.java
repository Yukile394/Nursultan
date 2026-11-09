package minecraft;

import com.google.gson.annotations.SerializedName;
import java.util.Set;

public record class04947(String seed, long worldTemplateId, int levelType, boolean generateStructures, Set<String> experiments) implements class04942 {
   @SerializedName("levelType")
   public int L() {
      return this.levelType;
   }

   public class04947(String seed, long worldTemplateId, int levelType, boolean generateStructures, Set<String> experiments) {
      this.seed = seed;
      this.worldTemplateId = worldTemplateId;
      this.levelType = levelType;
      this.generateStructures = generateStructures;
      this.experiments = experiments;
   }

   @SerializedName("experiments")
   public Set<String> i() {
      return this.experiments;
   }

   @SerializedName("generateStructures")
   public boolean u() {
      return this.generateStructures;
   }

   @SerializedName("worldTemplateId")
   public long y() {
      return this.worldTemplateId;
   }

   @SerializedName("seed")
   public String N() {
      return this.seed;
   }
}
