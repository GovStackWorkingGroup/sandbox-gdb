package global.govstack.digitalregistries.bb.emulator.dto;

public class ReadDto<T> {

    private QueryDto<T> query;

    public QueryDto<T> getQuery() {
        return query;
    }

    public ReadDto<T> setQuery(QueryDto<T> query) {
        this.query = query;
        return this;
    }
}
