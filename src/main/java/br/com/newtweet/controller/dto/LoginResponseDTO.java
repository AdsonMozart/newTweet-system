package br.com.newtweet.controller.dto;

public record LoginResponseDTO(String accessToken, Long expiresIn) {
}
