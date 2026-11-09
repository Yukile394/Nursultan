package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public record class00497(
   String name,
   Optional<class00392> displayName,
   Optional<class06541> color,
   boolean allowFriendlyFire,
   boolean seeFriendlyInvisibles,
   class00392 memberNamePrefix,
   class00392 memberNameSuffix,
   class06672 nameTagVisibility,
   class06672 deathMessageVisibility,
   class06656 collisionRule,
   List<String> players
) {
   public static final Codec<class00497> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.STRING.fieldOf("Name").forGetter(class00497::N),
            class03748.N.optionalFieldOf("DisplayName").forGetter(class00497::y),
            class06541.field_56511.optionalFieldOf("TeamColor").forGetter(class00497::L),
            Codec.BOOL.optionalFieldOf("AllowFriendlyFire", true).forGetter(class00497::u),
            Codec.BOOL.optionalFieldOf("SeeFriendlyInvisibles", true).forGetter(class00497::i),
            class03748.N.optionalFieldOf("MemberNamePrefix", class05220.N).forGetter(class00497::R),
            class03748.N.optionalFieldOf("MemberNameSuffix", class05220.N).forGetter(class00497::M),
            class06672.field_56489.optionalFieldOf("NameTagVisibility", class06672.field_1442).forGetter(class00497::B),
            class06672.field_56489.optionalFieldOf("DeathMessageVisibility", class06672.field_1442).forGetter(class00497::Z),
            class06656.field_56486.optionalFieldOf("CollisionRule", class06656.field_1437).forGetter(class00497::z),
            Codec.STRING.listOf().optionalFieldOf("Players", List.of()).forGetter(class00497::U)
         )
         .apply(var0, class00497::new)
   );

   public Optional<class06541> L() {
      return this.color;
   }

   public class00392 M() {
      return this.memberNameSuffix;
   }

   public class00497(
      String name,
      Optional<class00392> displayName,
      Optional<class06541> color,
      boolean allowFriendlyFire,
      boolean seeFriendlyInvisibles,
      class00392 memberNamePrefix,
      class00392 memberNameSuffix,
      class06672 nameTagVisibility,
      class06672 deathMessageVisibility,
      class06656 collisionRule,
      List<String> players
   ) {
      this.name = name;
      this.displayName = displayName;
      this.color = color;
      this.allowFriendlyFire = allowFriendlyFire;
      this.seeFriendlyInvisibles = seeFriendlyInvisibles;
      this.memberNamePrefix = memberNamePrefix;
      this.memberNameSuffix = memberNameSuffix;
      this.nameTagVisibility = nameTagVisibility;
      this.deathMessageVisibility = deathMessageVisibility;
      this.collisionRule = collisionRule;
      this.players = players;
   }

   public class06672 B() {
      return this.nameTagVisibility;
   }

   public class06672 Z() {
      return this.deathMessageVisibility;
   }

   public boolean i() {
      return this.seeFriendlyInvisibles;
   }

   public List<String> U() {
      return this.players;
   }

   public class06656 z() {
      return this.collisionRule;
   }

   public boolean u() {
      return this.allowFriendlyFire;
   }

   public Optional<class00392> y() {
      return this.displayName;
   }

   public String N() {
      return this.name;
   }

   public class00392 R() {
      return this.memberNamePrefix;
   }
}
