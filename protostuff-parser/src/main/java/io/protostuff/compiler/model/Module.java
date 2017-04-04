package io.protostuff.compiler.model;

import java.util.List;
import java.util.Map;
import org.immutables.value.Value;

/**
 * @author Kostiantyn Shchepanovskyi
 */
@Value.Immutable
public interface Module {

    String getName();

    List<Proto> getProtos();

    String getOutput();

    Map<String, Object> getOptions();

    UsageIndex usageIndex();

}
