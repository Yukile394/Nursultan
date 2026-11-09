package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03689(String msgId, class03691 scaling, float exhaustion, class03699 effects, class03700 deathMessageType) {
   public static final Codec<class03689> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.STRING.fieldOf("message_id").forGetter(class03689::N),
            class03691.field_42288.fieldOf("scaling").forGetter(class03689::y),
            Codec.FLOAT.fieldOf("exhaustion").forGetter(class03689::L),
            class03699.field_42281.optionalFieldOf("effects", class03699.field_42275).forGetter(class03689::u),
            class03700.field_42364.optionalFieldOf("death_message_type", class03700.field_42361).forGetter(class03689::i)
         )
         .apply(var0, class03689::new)
   );
   public static final Codec<class03556<class03689>> y = class03539.N(class04227.yN);
   public static final class02362<class04247, class03556<class03689>> L = class02389.y(class04227.yN);

   public float L() {
      return this.exhaustion;
   }

   public class03689(String msgId, class03691 scaling, float exhaustion, class03699 effects, class03700 deathMessageType) {
      super();
      this.msgId = msgId;
      this.scaling = scaling;
      this.exhaustion = exhaustion;
      this.effects = effects;
      this.deathMessageType = deathMessageType;
   }

   public class03689(String var1, float var2) {
      this(var1, class03691.field_42286, var2);
   }

   public class03689(String var1, class03691 var2, float var3) {
      this(var1, var2, var3, class03699.field_42275, class03700.field_42361);
   }

   public class03689(String var1, class03691 var2, float var3, class03699 var4) {
      this(var1, var2, var3, var4, class03700.field_42361);
   }

   public class03689(String var1, float var2, class03699 var3) {
      this(var1, class03691.field_42286, var2, var3);
   }

   public class03700 i() {
      return this.deathMessageType;
   }

   public class03699 u() {
      return this.effects;
   }

   public class03691 y() {
      return this.scaling;
   }

   public String N() {
      return this.msgId;
   }
}
