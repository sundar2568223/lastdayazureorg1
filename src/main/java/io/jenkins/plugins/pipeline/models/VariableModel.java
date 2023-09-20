package io.jenkins.plugins.pipeline.models;

import io.jenkins.plugins.pipeline.interfaces.ParsableModelInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Model Class for Key/Value Pairs used in Environments
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VariableModel extends AbstractModel implements ParsableModelInterface {
    private String key;
    private String value;

    @Override
    public String toGroovy() {
        return new StringBuffer()
                .append(this.key)
                .append(this.getVariableOpen())
                .append(this.value)
                .append(this.getVariableClose())
                .toString();
    }
}
