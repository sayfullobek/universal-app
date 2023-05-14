package ul.it.universalserver.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import ul.it.universalserver.service.AttachmentService;

import java.util.UUID;

@RestController
@RequestMapping("/api/attachment")
@RequiredArgsConstructor
public class AttachmentController {
    private final AttachmentService attachmentService;

    @PostMapping("/upload")
    public HttpEntity<?> upload(MultipartHttpServletRequest request) {
        UUID upload = attachmentService.upload(request);
        return ResponseEntity.ok(upload);
    }

    @GetMapping("/download")
    public HttpEntity<?> getFile(@RequestParam(name = "id", required = false) UUID id) {
        return attachmentService.getFile(id);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> deletePhoto(@PathVariable UUID id) {
        return attachmentService.deletePhoto(id);
    }
}
