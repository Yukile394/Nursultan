package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.stream.Stream;

public interface class02168<T, C, P> {
   Stream<class01894> L();

   T M(ImmutableStringReader var1, class01894 var2) throws CommandSyntaxException;

   T B(ImmutableStringReader var1, class01894 var2) throws CommandSyntaxException;

   P i(ImmutableStringReader var1, class01894 var2) throws CommandSyntaxException;

   Stream<class01894> u();

   T y(List<T> var1);

   T y(ImmutableStringReader var1, C var2, Dynamic<?> var3) throws CommandSyntaxException;

   Stream<class01894> y();

   T N(ImmutableStringReader var1, P var2, Dynamic<?> var3) throws CommandSyntaxException;

   Stream<class01894> N();

   T N(T var1);

   T N(ImmutableStringReader var1, C var2);

   C R(ImmutableStringReader var1, class01894 var2) throws CommandSyntaxException;
}
