package team.solution.teham.core.elements;

import org.json.JSONObject;

import team.solution.teham.core.ProcessExecutor;

public abstract class Element {
    
    protected final String id;

    protected final String source;

    protected final String name;
    
    protected String target;

    protected Element(String id, String name, String source, String target) {

        if (id == null || name == null || source == null) {
            throw new NullPointerException("id, name and source must not be null");
        }

        this.id = id;
        this.name = name;
        this.source = source;
        this.target = target;
    }

    public String getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public String getTarget() {
        return target;
    }

    public String getName() {
        return name;
    }

    public abstract JSONObject handle(ProcessExecutor processExecutor, JSONObject data);

}
