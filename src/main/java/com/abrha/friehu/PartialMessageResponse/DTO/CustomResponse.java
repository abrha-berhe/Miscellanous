package com.abrha.friehu.PartialMessageResponse.DTO;

import lombok.Data;

import java.util.List;

@Data
public class CustomResponse {
    private String message;
    private String status;
    private List<IdPairs> body;

    private CustomResponse(Builder bldr){
        this.message = bldr.message;
        this.status = bldr.status;
        this.body = bldr.body;
    }

    public static class Builder{
        private String message;
        private String status;
        private List<IdPairs> body;

        public Builder withMessage(String message, String status, List<IdPairs> body){
            this.message=message;
            this.status = status;
            this.body = body;
            return this;
        }
        public Builder withNoMessage(String status, List<IdPairs> body){
             this.status = status;
             this.body = body;
            return this;
        }
        public CustomResponse build() {
            CustomResponse user =  new CustomResponse(this);
            return user;
        }
    }


}
