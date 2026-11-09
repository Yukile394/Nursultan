package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class04930(class01263 settings, List<class05946<class06521<?>>> known, List<class05946<class06521<?>>> highlight) {
   public static final Codec<class04930> u = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01263.y.forGetter(class04930::N),
            class06521.M.listOf().fieldOf("recipes").forGetter(class04930::y),
            class06521.M.listOf().fieldOf("toBeDisplayed").forGetter(class04930::L)
         )
         .apply(var0, class04930::new)
   );

   public List<class05946<class06521<?>>> L() {
      return this.highlight;
   }

   public class04930(class01263 settings, List<class05946<class06521<?>>> known, List<class05946<class06521<?>>> highlight) {
      super();
      this.settings = settings;
      this.known = known;
      this.highlight = highlight;
   }

   public List<class05946<class06521<?>>> y() {
      return this.known;
   }

   public class01263 N() {
      return this.settings;
   }
}
