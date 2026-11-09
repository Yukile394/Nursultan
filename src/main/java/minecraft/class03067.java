package minecraft;

import com.mojang.brigadier.tree.ArgumentCommandNode;

public record class03067<S>(ArgumentCommandNode<S, ?> node, String value) {
   public String L() {
      return this.value;
   }

   public class03067(ArgumentCommandNode<S, ?> node, String value) {
      this.node = node;
      this.value = value;
   }

   public ArgumentCommandNode<S, ?> y() {
      return this.node;
   }

   public String N() {
      return this.node.getName();
   }
}
