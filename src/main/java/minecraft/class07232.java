package minecraft;

import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record class07232(int id, int start, int length, List<class07248> suggestions) implements class00381<class07280> {
   public static final class02362<class04247, class07232> N = class02362.N(
      class02389.B, class07232::y, class02389.B, class07232::L, class02389.B, class07232::u, class07248.N.N_33(class02389.N()), class07232::M, class07232::new
   );

   public int L() {
      return this.start;
   }

   public List<class07248> M() {
      return this.suggestions;
   }

   public class07232(int var1, Suggestions var2) {
      this(
         var1,
         var2.getRange().getStart(),
         var2.getRange().getLength(),
         var2.getList().stream().map(var0 -> new class07248(var0.getText(), Optional.ofNullable(var0.getTooltip()).map(class00390::N))).toList()
      );
   }

   public class07232(int id, int start, int length, List<class07248> suggestions) {
      super();
      this.id = id;
      this.start = start;
      this.length = length;
      this.suggestions = suggestions;
   }

   public int u() {
      return this.length;
   }

   public int y() {
      return this.id;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public Suggestions N() {
      StringRange stringrange = StringRange.between(this.start, this.start + this.length);
      return new Suggestions(stringrange, this.suggestions.stream().map(var1x -> new Suggestion(stringrange, var1x.N(), var1x.y().orElse(null))).toList());
   }

   @Override
   public class02897<class07232> method_65080() {
      return class04248.T;
   }
}
