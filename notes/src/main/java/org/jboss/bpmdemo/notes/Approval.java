package org.jboss.bpmdemo.notes;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(fea64f87b837f8d466965e32caec6418)
 */
@org.kie.api.definition.type.Label(value = "Approval")
public class Approval extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Description(value = "Level of approval required")
    @org.kie.api.definition.type.Label(value = "Approval Level")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String level;
    
    @org.kie.api.definition.type.Label(value = "Requires Approval")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.Boolean requiresApproval;

    public Approval() {
    }

    public Approval(java.lang.Boolean requiresApproval, java.lang.String level) {
        this.requiresApproval = requiresApproval;
        this.level = level;
    }


    
    public java.lang.String getLevel() {
        return this.level;
    }

    public void setLevel(java.lang.String level) {
        this.level = level;
    }
    
    public java.lang.Boolean getRequiresApproval() {
        return this.requiresApproval;
    }

    public void setRequiresApproval(java.lang.Boolean requiresApproval) {
        this.requiresApproval = requiresApproval;
    }
}